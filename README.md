# ![logo](src/main/resources/META-INF/pluginIcon.png) TempConfig Cleaner
> Automatically removes all temporary run/debug configurations when reopening the project.

## About

IntelliJ IDEA has a neat feature called "temporary configuration".

See:
* [Temporary configuration](https://www.jetbrains.com/help/idea/2016.2/run-debug-configuration.html#d149123e18)
* [Creating and Saving Temporary Run/Debug Configurations](https://www.jetbrains.com/help/idea/2016.2/creating-and-saving-temporary-run-debug-configurations.html)

While it's already possible to configure how many of these temporary configurations should be kept in your list, you may want to have them completely removed after your current coding session.

So this plugin will remove all temporary configurations when re-opening a project; giving you a fresh start and keeping your configurations clutter-free.

## Installation

Use the IDE's built-in plugin system:

* `File` --> `Settings` --> `Plugins` --> `Marketplace`
* search for "TempConfig Cleaner"
* click the `Install`-button

Or go to the [plugin page](https://plugins.jetbrains.com/plugin/9234) on the JetBrains-website, download the archive-file and install manually.

## License
Please read the [license](LICENSE) file.
