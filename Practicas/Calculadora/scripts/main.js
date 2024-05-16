document.addEventListener("DOMContentLoaded", function() {
    const display = document.getElementById('display');
    const buttons = Array.from(document.getElementsByClassName('button'));
    let operator = null;
    let operand1 = null;
    let operand2 = null;
    let shouldResetDisplay = false;

    buttons.forEach(button => {
        button.addEventListener('click', function() {
            const value = this.getAttribute('data-value');
            
            if (value === 'C') {
                clearDisplay();
            } else if (value === '=') {
                if (operator && operand1 !== null) {
                    operand2 = parseFloat(display.innerText);
                    const result = calculate(operand1, operand2, operator);
                    display.innerText = result;
                    resetCalculator();
                }
            } else if (['+', '-', '*', '/'].includes(value)) {
                if (operator && operand1 !== null) {
                    operand2 = parseFloat(display.innerText);
                    const result = calculate(operand1, operand2, operator);
                    display.innerText = result;
                    operand1 = result;
                } else {
                    operand1 = parseFloat(display.innerText);
                }
                operator = value;
                shouldResetDisplay = true;
            } else {
                if (shouldResetDisplay) {
                    display.innerText = value;
                    shouldResetDisplay = false;
                } else {
                    if (display.innerText === '0') {
                        display.innerText = value;
                    } else {
                        display.innerText += value;
                    }
                }
            }
        });
    });

    function clearDisplay() {
        display.innerText = '0';
        operator = null;
        operand1 = null;
        operand2 = null;
        shouldResetDisplay = false;
    }

    function resetCalculator() {
        operator = null;
        operand1 = null;
        operand2 = null;
        shouldResetDisplay = true;
    }

    function calculate(operand1, operand2, operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                return 0;
        }
    }
});
