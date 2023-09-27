const model1 = require('./../model/model1');
const model2 = require('./../model/model2');

exports.logInfoUserInput = (userInput) => {
    return model1.logInfoUserInput(userInput, 12);
};

exports.logDebugUserInput = (userInput) => {
    return model2.logDebugUserInput(userInput);
};