var exec = require('cordova/exec');

module.exports = {
    get: function(success, error, options) {
	success ( "Aaaaaaaaaaa" );

	var options = {};
	options.message = "TEST msg";
	options.duration = "long";
	cordova.exec(success, error, 'A77Plugin', 'get', [options]);

        // exec(success, error, "IMEI", "get", [options]);
    }
};