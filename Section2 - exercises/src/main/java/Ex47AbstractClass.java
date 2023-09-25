public class Ex47AbstractClass {
    abstract class ListItem {
        protected ListItem rightLink = null;
        protected ListItem leftLink = null;
        protected Object value;

        public ListItem(Object value) {
            this.value = value;
        }

        abstract ListItem next();
        abstract ListItem setNext(ListItem item);
        abstract ListItem previous();
        abstract ListItem setPrevious(ListItem item);
        abstract int compareTo(ListItem item);

        Object getValue() {
            return value;
        }

        void setValue(Object value) {
            this.value = value;
        }
    }

    class Node extends ListItem {
        public Node(Object value) {
            super(value);
        }

        @Override
        ListItem next() {
            return this.rightLink;
        }

        @Override
        ListItem setNext(ListItem item) {
            this.rightLink = item;
            return rightLink;
        }

        @Override
        ListItem previous() {
            return this.leftLink;
        }

        @Override
        ListItem setPrevious(ListItem item) {
            this.leftLink = item;
            return leftLink;
        }

        @Override
        int compareTo(ListItem item) {
            if (item != null) {
                return ((String) super.getValue()).compareTo((String) item.getValue());
            } else {
                return -1;
            }
        }
    }

    static class MyLinkedList implements NodeList {
        private ListItem root;

        public MyLinkedList(ListItem root) {
            this.root = root;
        }

        @Override
        public ListItem getRoot() {
            return root;
        }

        @Override
        public boolean addItem(ListItem item) {
            if (root == null) {
                root = item;
                return true;
            }

            ListItem currentItem = root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0) {
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(item);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.previous() != null) {
                        currentItem = currentItem.previous();
                    } else {
                        currentItem.setPrevious(item);
                        return true;
                    }
                } else {
                    // Item already exists
                    return false;
                }
            }
            return false;
        }

        @Override
        public boolean removeItem(ListItem item) {
            if (item != null) {
                System.out.println("Deleting item " + item.getValue());
            }

            ListItem currentItem = root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    // Found the item to delete
                    performRemoval(currentItem, parentItem);
                    return true;
                }
            }
            return false;
        }

        private void performRemoval(ListItem item, ListItem parent) {
            if (item.next() == null) {
                if (parent.next() == item) {
                    parent.setNext(item.previous());
                } else if (parent.previous() == item) {
                    parent.setPrevious(item.previous());
                } else {
                    root = item.previous();
                }
            } else if (item.previous() == null) {
                if (parent.next() == item) {
                    parent.setNext(item.next());
                } else if (parent.previous() == item) {
                    parent.setPrevious(item.next());
                } else {
                    root = item.next();
                }
            } else {
                ListItem current = item.next();
                ListItem leftmostParent = item;
                while (current.previous() != null) {
                    leftmostParent = current;
                    current = current.previous();
                }
                item.setValue(current.getValue());
                if (leftmostParent == item) {
                    item.setNext(current.next());
                } else {
                    leftmostParent.setPrevious(current.next());
                }
            }
        }

        @Override
        public void traverse(ListItem root) {
            if (root != null) {
                traverse(root.previous());
                System.out.println(root.getValue());
                traverse(root.next());
            }
        }
    }

    interface NodeList {
        ListItem getRoot();
        boolean addItem(ListItem item);
        boolean removeItem(ListItem item);
        void traverse(ListItem root);
    }

    static class SearchTree implements NodeList {
        private ListItem root;

        public SearchTree(ListItem root) {
            this.root = root;
        }

        @Override
        public ListItem getRoot() {
            return root;
        }

        @Override
        public boolean addItem(ListItem newItem) {
            if (root == null) {
                root = newItem;
                return true;
            }

            ListItem currentItem = root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(newItem);
                if (comparison < 0) {
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(newItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.previous() != null) {
                        currentItem = currentItem.previous();
                    } else {
                        currentItem.setPrevious(newItem);
                        return true;
                    }
                } else {
                    // Item already exists
                    return false;
                }
            }
            return false;
        }

        @Override
        public boolean removeItem(ListItem item) {
            if (item != null) {
                System.out.println("Deleting item " + item.getValue());
            }

            ListItem currentItem = root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    performRemoval(currentItem, parentItem);
                    return true;
                }
            }
            return false;
        }

        private void performRemoval(ListItem item, ListItem parent) {
            if (item.next() == null) {
                if (parent.next() == item) {
                    parent.setNext(item.previous());
                } else if (parent.previous() == item) {
                    parent.setPrevious(item.previous());
                } else {
                    root = item.previous();
                }
            } else if (item.previous() == null) {
                if (parent.next() == item) {
                    parent.setNext(item.next());
                } else if (parent.previous() == item) {
                    parent.setPrevious(item.next());
                } else {
                    root = item.next();
                }
            } else {
                ListItem current = item.next();
                ListItem leftmostParent = item;
                while (current.previous() != null) {
                    leftmostParent = current;
                    current = current.previous();
                }
                item.setValue(current.getValue());
                if (leftmostParent == item) {
                    item.setNext(current.next());
                } else {
                    leftmostParent.setPrevious(current.next());
                }
            }
        }

        @Override
        public void traverse(ListItem root) {
            if (root != null) {
                traverse(root.previous());
                System.out.println(root.getValue());
                traverse(root.next());
            }
        }
    }
}
