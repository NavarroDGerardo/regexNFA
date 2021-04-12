// Generated from E:/Octavo Semestre/Compiladores/ExamenMedioTermino/src\Expr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(ExprParser.ReContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(ExprParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#simple_re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_re(ExprParser.Simple_reContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(ExprParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#basic_re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_re(ExprParser.Basic_reContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(ExprParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(ExprParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#elementary_re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementary_re(ExprParser.Elementary_reContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(ExprParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(ExprParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ExprParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#chara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChara(ExprParser.CharaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(ExprParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#positive_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_set(ExprParser.Positive_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#set_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_items(ExprParser.Set_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_item(ExprParser.Set_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(ExprParser.RangeContext ctx);
}