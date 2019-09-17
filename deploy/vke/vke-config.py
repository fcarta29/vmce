#!/usr/bin/env python3
import configparser
import os
import string
import io
import copy

configFileSample = 'vke.conf.template'
configFilePath = os.path.realpath('../data')
configFile = 'vke.conf'

def getConfig():
    configBuf = io.StringIO()
    configBuf.write('[c]\n')

    #If config file exists
    if os.path.exists(configFilePath + '/' + configFile):
        #read existing config
        with open(configFilePath + '/' + configFile) as cf:
            configBuf.write(cf.read())
    else:  #start with the sample
        with open(configFileSample) as cf:
            configBuf.write(cf.read())

    configBuf.seek(0,os.SEEK_SET)

    cp = configparser.ConfigParser()
    cp.readfp(configBuf)
    return dict(cp.items('c'))


originalConfig = getConfig()
updatedConfig = copy.deepcopy(originalConfig)


for key in sorted(iter(originalConfig.keys())):
    value = originalConfig[key]
    # get user input.  provide existing / default value in []
    #If user input is blank, keep the original value
    newValue = input('{} [{}] : '.format(key.upper(), value)) or value
    updatedConfig[key] = newValue.strip()

if not os.path.exists(configFilePath):
    os.makedirs(configFilePath)

with open(configFilePath + '/' + configFile,'w') as cf:
    for key in sorted(iter(updatedConfig.keys())):
        cf.write('{}={}\n'.format(key.upper(), updatedConfig[key]))
