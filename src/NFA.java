import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{
    //TODO
    private HashMap<Integer, HashMap<Character, Set<Integer>>> states = new HashMap<>();// identifier { process { identifier (otro estado) } }
    private Set<Character> alphabet = new HashSet<Character>(); //chara
    private int sts = 0; //identifiers

    public NFA() {

    }

    public Set<Integer> get(int state, char c){
        return this.states.get(state).get(c);
    }

    public int getStates(){
        return sts;
    }

    public Set<Character> getAlphabet(){
        return alphabet;
    }

    public void setSts(int sts) {
        this.sts = sts;
    }

    public HashMap<Integer, HashMap<Character, Set<Integer>>> getAllStates(){
        return states;
    }
}


