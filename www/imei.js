var exec = require('cordova/exec');

module.exports = {
    get: function(success, error, options) {
	success ( "Aaaaaaaaaaa" );
        // exec(success, error, "IMEI", "get", [options]);
    }
};