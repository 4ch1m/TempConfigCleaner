#TempConfig Cleaner
Automatically removes all temporary run/debug configurations when reopening the project.

##About

IntelliJ IDEA has a neat feature called "temporary configuration".

See:
* [Temporary configuration](https://www.jetbrains.com/help/idea/2016.2/run-debug-configuration.html#d149123e18)
* [Creating and Saving Temporary Run/Debug Configurations](https://www.jetbrains.com/help/idea/2016.2/creating-and-saving-temporary-run-debug-configurations.html)

While it's already possible to configure how many of these temporary configurations should be kept in your list, you may want to have them completely removed after your current coding session.

So this plugin will remove all temporary configurations when re-opening a project; giving you a fresh start and keeping your configurations clutter-free.

##Installation
Use the IDE's built-in plugin system:

<kbd>Preferences</kbd> &rarr; <kbd>Plugins</kbd> &rarr; <kbd>Browse repositories...</kbd> &rarr; <kbd>Search for "TempConfig Cleaner"</kbd> &rarr; <kbd>Install Plugin</kbd>

Or go to the [plugin page](https://plugins.jetbrains.com/plugin/9234?pr=idea) on the JetBrains-website, download the archive-file and install manually.

##Changelog

#### **v1.1** (2016-11-05):
* automatically select the first existing configuration in your list, if none is selected after removing the temp-configs

#### **v1.0** (2016-11-05):
* initial release

##Author
Developed by *Achim Seufert*

Website: [achimonline.de](http://www.achimonline.de)

eMail: [intellij@achimonline.de](mailto:intellij@achimonline.de)

##License
*TempConfig Cleaner* is licensed under the terms of the *GNU General Public License license* (GPL-3.0+).

Read the file [LICENSE.txt](LICENSE.txt) for further details.
