cordova-plugin-a77
======================
To install this plugin, follow the [Command-line Interface Guide](http://cordova.apache.org/docs/en/edge/guide_cli_index.md.html#The%20Command-line%20Interface).

If you are not using the Cordova Command-line Interface, follow [Using Plugman to Manage Plugins](http://cordova.apache.org/docs/en/edge/guide_plugin_ref_plugman.md.html).

Exposes 2 methods:

- __scanCard__: returns scanned card data  
takes two arguments, success and error functions.

- __getVersion__: returns plugin version


Usage examples:

    window.plugins.a77.scanCard(
      function(scannedData) {
        console.log("scanned: " + scannedData);
      },
      function(err) {
        console.log("error scanning: " + err);
      }
    );
    console.log("a77 version: " + window.plugins.a77.getVersion();
