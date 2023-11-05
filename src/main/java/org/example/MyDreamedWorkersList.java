package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDreamedWorkersList implements Iterable <BaseWorker> {
    private List<BaseWorker> workers;
    public MyDreamedWorkersList(List<BaseWorker> workers) {
        this.workers = workers;
    }
    @Override
    public Iterator<BaseWorker> iterator() {
        return workers.iterator();
    }

}
