class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }
    private void generate(List<String> result, String current, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        if (left > 0) {
            generate(result, current + '(', left - 1, right);
        }
        if (right > left) {
            generate(result, current + ')', left, right - 1);
        }
    }
}