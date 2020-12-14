package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.Iterator;

/** Classe para percorrer a arvore de configurações
 **/
public class Iterador implements Iterator<Arvore> {

    enum ProcessStages {
        ProcessParent, ProcessChildCurNode, ProcessChildSubNode
    }

    private Arvore arvore;

    public Iterador(Arvore arvore) {
        this.arvore = arvore;
        this.doNext = ProcessStages.ProcessParent;
        this.childrenCurNodeIter = arvore.filho.iterator();
    }

    private ProcessStages doNext;
    private Arvore next;
    private Iterator<Arvore> childrenCurNodeIter;
    private Iterator<Arvore> childrenSubNodeIter;

    @Override
    public boolean hasNext() {

        if (this.doNext == ProcessStages.ProcessParent) {
            this.next = this.arvore;
            this.doNext = ProcessStages.ProcessChildCurNode;
            return true;
        }

        if (this.doNext == ProcessStages.ProcessChildCurNode) {
            if (childrenCurNodeIter.hasNext()) {
                Arvore childDirect = childrenCurNodeIter.next();
                childrenSubNodeIter = childDirect.iterator();
                this.doNext = ProcessStages.ProcessChildSubNode;
                return hasNext();
            }

            else {
                this.doNext = null;
                return false;
            }
        }

        if (this.doNext == ProcessStages.ProcessChildSubNode) {
            if (childrenSubNodeIter.hasNext()) {
                this.next = childrenSubNodeIter.next();
                return true;
            }
            else {
                this.next = null;
                this.doNext = ProcessStages.ProcessChildCurNode;
                return hasNext();
            }
        }

        return false;
    }

    @Override
    public Arvore next() {
        return this.next;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
