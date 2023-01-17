package com.example.fourwork;

import java.util.ArrayList;
import java.util.List;

public class GitResult {

        private int totalCount;
        private boolean incompleteResults;
        private List<Items> items = new ArrayList<>();

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public boolean isIncompleteResults() {
            return incompleteResults;
        }

        public void setIncompleteResults(boolean incompleteResults) {
            this.incompleteResults = incompleteResults;
        }

        public List<Items> getItems() {
            return items;
        }

        public void setItems(List<Items> items) {
            this.items = items;
        }
    }
