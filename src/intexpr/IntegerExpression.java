package intexpr;

/** Immutable type representing an integer arithmetic expression. */
public interface IntegerExpression {
    // Data type definition
    //    IntegerExpression = Number(n:int)
    //                        + Plus(left:IntegerExpression, right:IntegerExpression)
    //                        + Times(left:IntegerExpression, right:IntegerExpression)
    
    /** @return the computed value of this expression */
    public int value();
}
