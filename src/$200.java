/**
 * 200. 岛屿数量
 */
public class $200 {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int numIslands(char[][] grid) {
        int r = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    r++;
                }
            }
        }
        return r;
    }

    public void dfs(char[][] grid, int x, int y) {
        if (grid[x][y] == '0') return;
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == '1')
                dfs(grid, nx, ny);
        }
    }

}
