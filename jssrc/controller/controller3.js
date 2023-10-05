const service1 = require('./../service/service1');
const express = require('express');

const router = express.Router();


router.get('/newEntry', (req, res) => {

    const result = service1.logDebugUserInput(req.query.userInput);
    res.json({ result: result });
} );



module.exports = router;