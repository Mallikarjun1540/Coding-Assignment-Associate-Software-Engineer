document.addEventListener('DOMContentLoaded', function () {
    const result = document.getElementById('result');
    const buttons = document.querySelectorAll('button');

    let currentInput = '';
    let operator = '';
    let firstOperand = null;

    buttons.forEach(button => {
        button.addEventListener('click', function () {
            const buttonText = button.textContent;

            if (button.classList.contains('number')) {
                currentInput += buttonText;
                result.value = currentInput;
            } else if (button.classList.contains('operator')) {
                if (button.id === 'clear') {
                    clear();
                } else if (button.id === 'backspace') {
                    backspace();
                } else if (button.id === 'calculate') {
                    calculate();
                } else {
                    handleOperator(button.id);
                }
            }
        });
    });

    function clear() {
        currentInput = '';
        operator = '';
        firstOperand = null;
        result.value = '';
    }

    function backspace() {
        currentInput = currentInput.slice(0, -1);
        result.value = currentInput;
    }

    function handleOperator(newOperator) {
        if (currentInput === '') return;
        if (firstOperand === null) {
            firstOperand = parseFloat(currentInput);
            currentInput = '';
        } else {
            calculate();
        }
        operator = newOperator;
    }

    function calculate() {
        if (currentInput === '' || firstOperand === null || operator === '') return;

        const secondOperand = parseFloat(currentInput);
        let answer;

        switch (operator) {
            case 'add':
                answer = firstOperand + secondOperand;
                break;
            case 'subtract':
                answer = firstOperand - secondOperand;
                break;
            case 'multiply':
                answer = firstOperand * secondOperand;
                break;
            case 'divide':
                if (secondOperand === 0) {
                    answer = 'Error';
                } else {
                    answer = firstOperand / secondOperand;
                }
                break;
        }

        clear();
        result.value = answer;
    }
});
