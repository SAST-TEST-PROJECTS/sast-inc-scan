const express = require('express');
const controller1 = require('./controller/controller1');
const controller2 = require('./controller/controller2');
const controller3 = require('./controller/controller3');

const app = express();
const port = 3000;

// Middleware to parse JSON
app.use(express.json());

// Use the controller1 for routing
app.use('/api', controller1, controller2, controller3);

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
