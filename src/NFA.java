import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{
    //TODO
    private HashMap<Integer, HashMap<Character, List<Integer>>> states = new HashMap<>();// identifier { process { identifier (otro estado) } }
    private Set<Character> alphabet = new HashSet<Character>(); //chara
    private Set<Integer> sts = new HashSet<>(); //identifiers

    public Set<Integer> get(int state, char c){
        return sts;
    }
    public int getStates(){
        return 0;
    }
    public Set<Character> getAlphabet(){
        return alphabet;
    }
}


