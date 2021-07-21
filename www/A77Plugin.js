var exec = require('cordova/exec');

module.exports = {
    get: function(success, error, options) {
	success ( "Aaaaaaaaaaa" );

	var options = {};
	options.message = "TEST msg";
	options.duration = "long";
	cordova.exec(success, error, 'ToastyPlugin', 'show', [options]);

        // exec(success, error, "IMEI", "get", [options]);
    }
};