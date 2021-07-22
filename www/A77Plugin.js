// var exec = require('cordova/exec');

module.exports = {
    get: function(success, error, options) {
	success ( "Aaaaaaaaaaa" );

	var options = {};
	options.message = "TEST msg";
	options.duration = "long";
	cordova.exec(success, error, 'A77Plugin', 'get', [options]);

        // exec(success, error, "IMEI", "get", [options]);
    },

    scanCard: function(success, error, options) {
	    success ( "A77Plugin.js - scanCard" );
	    var options = {};
	    cordova.exec(success, error, 'A77Plugin', 'scanCard', [options]);
    },

    getVersion : function() { return "v1.1"; }
};
