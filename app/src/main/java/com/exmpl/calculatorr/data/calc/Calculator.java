package com.exmpl.calculatorr.data.calc;

import com.exmpl.calculatorr.data.model.expr.Expression;
import com.exmpl.calculatorr.data.model.expr.Notated;
import com.exmpl.calculatorr.data.model.oprnd.Operand;

public interface Calculator<T extends Expression & Notated, R extends Operand> {

    R calculate(T expr);
}
