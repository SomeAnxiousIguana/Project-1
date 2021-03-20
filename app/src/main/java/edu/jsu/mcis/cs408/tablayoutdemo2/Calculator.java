package edu.jsu.mcis.cs408.tablayoutdemo2;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {
    private final FragmentOne parent;
    private StringBuilder inputBuffer ;
    private boolean inputAccumulate;
    private String outputBuffer, operationBuffer ;
    private BigDecimal leftOperand , rightOperand;

    public Calculator(FragmentOne parent) {
        this.parent = parent;
        this.inputAccumulate = false;
        this.inputBuffer = new StringBuilder("0");
        this.outputBuffer = "0";
        this.operationBuffer = "";
        this.leftOperand = null;
        this.rightOperand = null;
    }

    public void process(String button) {

        if ( button.equals( parent.getResources().getString(R.string.btnClear) ) ) {
            leftOperand = null;
            rightOperand = null;
            inputBuffer.replace(0, inputBuffer.length(), "0");;
            operationBuffer = null;
            outputBuffer = "0";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnPlus) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
            operationBuffer = "add";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMinus) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
            operationBuffer = "subtract";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMul) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
            operationBuffer = "multiply";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDiv) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
            operationBuffer = "divide";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnPer) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
            operationBuffer = "well";
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSqRt) ) ) {
            BigDecimal temp = new BigDecimal(inputBuffer.toString());
            temp = BigDecimal.valueOf((Math.pow((temp.doubleValue()),0.5)));
            inputBuffer.replace(0, inputBuffer.length(), temp.toString());
            outputBuffer = inputBuffer.toString();
            inputAccumulate = false;
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSign) ) ) {
            BigDecimal temp = new BigDecimal(inputBuffer.toString());
            temp = temp.multiply(BigDecimal.valueOf(-1));
            inputBuffer.replace(0, inputBuffer.length(), temp.toString());
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDec) ) ) {
            if (!inputBuffer.toString().contains(".")) {
                inputBuffer.append(".");
                outputBuffer = inputBuffer.toString();
            }
        }

        if ( button.equals( parent.getResources().getString(R.string.btnEq) ) ) {
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }
            if (operationBuffer != null) {
                operate();
            }
            outputBuffer = leftOperand.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn9) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "9");
                inputAccumulate = true;
            } else {
                inputBuffer.append("9");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn8) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "8");
                inputAccumulate = true;
            } else {
                inputBuffer.append("8");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn7) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "7");
                inputAccumulate = true;
            } else {
                inputBuffer.append("7");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn6) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "6");
                inputAccumulate = true;
            } else {
                inputBuffer.append("6");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn5) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "5");
                inputAccumulate = true;
            } else {
                inputBuffer.append("5");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn4) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "4");
                inputAccumulate = true;
            } else {
                inputBuffer.append("4");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn3) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "3");
                inputAccumulate = true;
            } else {
                inputBuffer.append("3");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn2) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "2");
                inputAccumulate = true;
            } else {
                inputBuffer.append("2");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn1) ) ) {
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "1");
                inputAccumulate = true;
            } else {
                inputBuffer.append("1");
            }
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn0) ) ) {
            if (!"0".equals(inputBuffer.toString())) {
                if (inputAccumulate = true) {
                    inputBuffer.append("0");
                } else {
                    inputBuffer.replace(0, inputBuffer.length(), "0");
                }
            }
            outputBuffer = inputBuffer.toString();
        }

    }

    public void operate(){

        if (leftOperand != null) {
            if (rightOperand == null) {
                rightOperand = leftOperand;
            }
            switch (operationBuffer) {
                case "add":
                    leftOperand = leftOperand.add(rightOperand);
                    break;
                case "subtract":
                    leftOperand = leftOperand.subtract(rightOperand);
                    break;
                case "multiply":
                    leftOperand = leftOperand.multiply(rightOperand);
                    break;
                case "divide":
                    if (rightOperand.compareTo(BigDecimal.ZERO) == 0) {
                        //TO-DO
                    } else {
                        leftOperand = leftOperand.divide(rightOperand);
                        break;
                    }
                case "well":
                    leftOperand = leftOperand.remainder(rightOperand);
                    break;
                default:
                    break;
            }
            outputBuffer = leftOperand.toString();
            inputBuffer.replace(0, inputBuffer.length(), leftOperand.toString());
            inputAccumulate = false;
        }
    }
    public String getDisplay(){
        return outputBuffer;
    }
}
