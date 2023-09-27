const service1 = require('./../service/service1');
const express = require('express');

const router = express.Router();

// Route to handle input
router.get('/hello', (req, res) => {
    res.json({ result: "Hello world" });
} );

router.get('/logInfoUserInput', (req, res) => {

    const result = service1.logInfoUserInput(req.query.userInput);
    res.json({ result: result });
} );



module.exports = router;