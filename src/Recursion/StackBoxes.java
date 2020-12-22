package Recursion;

public class StackBoxes {

    // Dynamic approach

    public ArrayList<Box> createStackD(Box[] boxes, Box bottom, HashMap<Box, ArrayList<Box>> stack_map) {
        if (bottom != null && stack_map.containsKey(bottom)) {
            return stack_map.get(bottom);
        }

        int max_height = 0;
        ArrayList<Box> max_stack = null;

        for (int i = 0; i < boxes.length; i++) {
            if(boxes[i].canGoAbove(bottom)) {
                ArrayList<Box> new_stack = createStackD(boxes, boxes[i], stack_map);
                int new_height = stackHeight(new_stack);
                if (new_height > max_height) {
                    max_stack = new_stack;
                    max_height = new_height;
                }
            }
        }

        if (max_stack == null) {
            max_stack = new ArrayList<Box>();
        }

        if (bottom != null) {
            max_stack.add(0, bottom);
        }

        stack_map.put(bottom, max_stack);

        return (ArrayList<Box>) max_stack.clone();
    }

    public ArrayList<Box> createStack(Box[] boxes, Box bottom) {
        int max_height = 0;
        ArrayList<Box> max_stack = null;

        for (int i = 0; i < boxes.length; i++) {
            if(boxes[i].canGoAbove(bottom)) {
                ArrayList<Box> new_stack = createStack(boxes, boxes[i]);
                int new_height = stackHeight(new_stack);
                if (new_height > max_height) {
                    max_stack = new_stack;
                    max_height = new_height;
                }
            }
        }

        if (max_stack == null) {
            max_stack = new ArrayList<Box>();
        }

        if (bottom != null) {
            max_stack.add(0, bottom);
        }

        return max_stack;
    }

}
