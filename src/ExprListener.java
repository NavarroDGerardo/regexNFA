// Generated from E:/Octavo Semestre/Compiladores/ExamenMedioTermino/src\Expr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(ExprParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(ExprParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(ExprParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(ExprParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#simple_re}.
	 * @param ctx the parse tree
	 */
	void enterSimple_re(ExprParser.Simple_reContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#simple_re}.
	 * @param ctx the parse tree
	 */
	void exitSimple_re(ExprParser.Simple_reContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(ExprParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(ExprParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#basic_re}.
	 * @param ctx the parse tree
	 */
	void enterBasic_re(ExprParser.Basic_reContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#basic_re}.
	 * @param ctx the parse tree
	 */
	void exitBasic_re(ExprParser.Basic_reContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(ExprParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(ExprParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(ExprParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(ExprParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elementary_re}.
	 * @param ctx the parse tree
	 */
	void enterElementary_re(ExprParser.Elementary_reContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elementary_re}.
	 * @param ctx the parse tree
	 */
	void exitElementary_re(ExprParser.Elementary_reContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(ExprParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(ExprParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(ExprParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(ExprParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ExprParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ExprParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#chara}.
	 * @param ctx the parse tree
	 */
	void enterChara(ExprParser.CharaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#chara}.
	 * @param ctx the parse tree
	 */
	void exitChara(ExprParser.CharaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(ExprParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(ExprParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#positive_set}.
	 * @param ctx the parse tree
	 */
	void enterPositive_set(ExprParser.Positive_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#positive_set}.
	 * @param ctx the parse tree
	 */
	void exitPositive_set(ExprParser.Positive_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#set_items}.
	 * @param ctx the parse tree
	 */
	void enterSet_items(ExprParser.Set_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#set_items}.
	 * @param ctx the parse tree
	 */
	void exitSet_items(ExprParser.Set_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#set_item}.
	 * @param ctx the parse tree
	 */
	void enterSet_item(ExprParser.Set_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#set_item}.
	 * @param ctx the parse tree
	 */
	void exitSet_item(ExprParser.Set_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ExprParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ExprParser.RangeContext ctx);
}