The **SambaDoc Filter Plugin for OmegaT** project provides Samba documents' docbook plugin for the **open-source translation tool [OmegaT](http://www.omegat.org/ OmegaT).

## Downloads:

 * The latest stable version of the SambaDoc Filter Plugin for OmegaT is at https://bintray.com/miurahr/omegat-plugins

## Build

SambaDoc filter plugin uses Gradle build system. You need to connect internet and
sinmply run following command:

```
$ ./gradlew build
```

or on Windows

```
$ .\gradlew.bat build
```

## Install:

  After OmegaT installation completed, you can install plugin.

#### Linux

 Place plugin jar file at ~/.omegat/plugins/ for single user,  or OmegaT installation directory for all user
ex. /opt/omegat/OmegaT-3.6.0/plugins/ 

#### Windows

On Windows you can install the plugin to the plugins directory where OmegaT is installed (e.g. C:\Program Files\OmegaT) or to your Application Data directory:
C:\Users\<username>\AppData\Roaming\OmegaT

#### MacOS X

On OS X you are recommended to install the plugin to /Users/<username>/Library/Preferences/OmegaT/plugins. 
