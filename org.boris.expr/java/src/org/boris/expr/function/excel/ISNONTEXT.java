package org.boris.expr.function.excel;

import org.boris.expr.Expr;
import org.boris.expr.ExprException;
import org.boris.expr.ExprString;
import org.boris.expr.function.AbstractFunction;

public class ISNONTEXT extends AbstractFunction
{
    public Expr evaluate(Expr[] args) throws ExprException {
        assertArgCount(args, 1);
        Expr e = evalArg(args[0]);
        return bool(!(e instanceof ExprString) ||
                "".equals(((ExprString) e).str));
    }
}
