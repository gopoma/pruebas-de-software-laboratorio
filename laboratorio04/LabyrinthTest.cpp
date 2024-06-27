#include <bits/stdc++.h>
using namespace std;

#ifdef LOCAL
    #include "debug.h"
#else
    #define dbg(...)     0
    #define chk(...)     0

    #define RAYA         0
#endif

#define RESET   "\033[0m"
#define BLACK   "\033[30m" /* Black */
#define RED     "\033[31m" /* Red */
#define GREEN   "\033[32m" /* Green */
#define YELLOW  "\033[33m" /* Yellow */
#define BLUE    "\033[34m" /* Blue */
#define MAGENTA "\033[35m" /* Magenta */
#define CYAN    "\033[36m" /* Cyan */
#define WHITE   "\033[37m" /* White */

#include "Labyrinth.h"

void ExecuteTestSuite() {
    int amount_passed = 0;
    int amount_no_passed = 0;
    auto test = [&](
        int id,
        int N, 
        vector<string>& S, 
        long long ExpectedValue
    ) -> void {
        cout << YELLOW << "Test #" << id << ":\n" << RESET;
        cout << YELLOW << "N (int): " << N << "\n" << RESET;
        cout << YELLOW << "S (vector<string>&):\n" << RESET; 
        for(auto& x: S) cout << YELLOW << x << "\n" << RESET;
        cout << "\n";

        long long CalculatedValue = calculateVisibleWallpaperArea(N, S);
        cout << "CalculatedValue: " << CalculatedValue << "\n";
        cout << "ExpectedValue: " << ExpectedValue << "\n\n";

        if(CalculatedValue == ExpectedValue) {
            amount_passed++;
            cout << GREEN << "Test Case Accepted: ok, got " << ExpectedValue << RESET << "\n";
        } else {
            amount_no_passed++;
            cout << RED << "Test Case Failed: Expected " << ExpectedValue << ", but got " << CalculatedValue << RESET << "\n";
        }
        cout << "\n\n";
    };

    {
        int N = 5;
        vector<string> S{
            ".....",
            "...##",
            "..#..",
            "..###",
            ".....",
        };
        test(1, N, S, 198);
    }

    {
        int N = 3;
        vector<string> S{
            "...",
            "...",
            "...",
        };
        test(2, N, S, 72);
    }

    {
        int N = 3;
        vector<string> S{
            ".##",
            "###",
            "##.",
        };
        test(3, N, S, 36);
    }

    {
        int N = 4;
        vector<string> S{
            ".#.#",
            "#.#.",
            ".#.#",
            "#.#.",
        };
        test(4, N, S, 36);
    }

    {
        int N = 5;
        vector<string> S{
            "..###",
            "#.#.#",
            "#.###",
            "#....",
            "####.",
        };
        test(5, N, S, 144);
    }

    {
        int N = 6;
        vector<string> S{
            ".#.#.#",
            "..#.#.",
            ".#.#.#",
            "..#.#.",
            ".#.#.#",
            "......",
        };
        test(6, N, S, 252);
    }

    {
        int N = 6;
        vector<string> S{
            ".#####",
            ".#.#.#",
            ".#####",
            ".#...#",
            ".#####",
            "......",
        };
        test(7, N, S, 180);
    }

    {
        int idTest = 8;
        int N = 3;
        vector<string> S{
            "..#",
            ".#.",
            "#..",
        };
        long long ExpectedValue = 108;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 9;
        int N = 33;
        vector<string> S{
            ".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "##.#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "...............................##",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "#..#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "##.#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "...............................##",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "#..#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "##.#.#.#.#.#.#.#.#.#.#.#.#.#.###.",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "#..#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "##.#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "...............................##",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "#..#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "...............................##",
            "#.##.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "................................#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#",
            "##.#.#.#.#.#.#.#.#.#.#.#.#.#.#...",
            "...............................##",
            "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#....",
        };
        long long ExpectedValue = 12384;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 10;
        int N = 3;
        vector<string> S{
            ".#.",
            ".#.",
            ".#.",
        };
        long long ExpectedValue = 108;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 11;
        int N = 10;
        vector<string> S{
            "..........",
            "#......#..",
            "...#......",
            "###..#...#",
            "...#..##..",
            "......##..",
            "....#..###",
            "...#..#.#.",
            "..#####...",
            "....#.....",
        };
        long long ExpectedValue = 864;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 12;
        int N = 9;
        vector<string> S{
            "..##.####",
            "#.......#",
            ".#.##.##.",
            "##..#.#.#",
            "...#..#..",
            "#......#.",
            ".....#..#",
            "#####..#.",
            "#.###....",
        };
        long long ExpectedValue = 576;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 13;
        int N = 20;
        vector<string> S{
            "..........#......#..",
            "...#......###..#...#",
            "...#..##........##..",
            "....#..###...#..#.#.",
            "..#####.......#.....",
            "..#..#.#..#.###.##..",
            "...#.......#..#.....",
            "..#.##...#...#.####.",
            "..##.#....#....##...",
            "...#..#.....###...#.",
            "#...###.##...#.##.#.",
            ".......#..#..##.....",
            "...#...##...........",
            ".......###....#.###.",
            "#..###.#.#.#.......#",
            ".....#.##..#.#.####.",
            "#....##..#.#..#...#.",
            "....#..#.###...#.##.",
            ".#.......#....#.#.##",
            "......#.....#.......",
        };
        long long ExpectedValue = 3222;

        test(idTest, N, S, ExpectedValue);
    }

    {
        int idTest = 14;
        int N = 33;
        vector<string> S{
            "..........#......#.....#......###",
            "..#...#...#..##........##......#.",
            ".###...#..#.#...#####.......#....",
            "...#..#.#..#.###.##.....#.......#",
            "..#.......#.##...#...#.####...##.",
            "#....#....##......#..#.....###...",
            "#.#...###.##...#.##.#........#..#",
            "..##........#...##...............",
            "...###....#.###.#..###.#.#.#.....",
            "..#.....#.##..#.#.####.#....##..#",
            ".#..#...#.....#..#.###...#.##..#.",
            "......#.#..#.#.##......##....##..",
            ".#.#.#..#.####.#..##.#..##....#.#",
            "..#.#..#...#...#....#..#.....#...",
            "#....##....##.....#....#.#..#...#",
            "..####...#..##.#..#......#.....#.",
            "..#.####..#...#####...#....#.#.#.",
            ".......###.##.....#....##.#.#.#..",
            "..#.....#.##.#...#..#....#.#.#...",
            "#..##.#...#.......#.......#...#..",
            "#...#..#.##.#.......#.##..####...",
            ".#....#..#####......#.#.###....#.",
            "..#.#.#....#.#.#..##..#....#..##.",
            ".#..##...#.###..#.......###.#..##",
            ".#.#.....#..............###...#..",
            "..##...####.#.#..##.#.#....#...#.",
            ".....##...........#.#....#....##.",
            "..##..#.####...#.##.....##.#.....",
            ".....#...........##.#.##.#.#...#.",
            ".#........#......##.....#..###.##",
            "....##...#.#.#.#.######...#...#..",
            "#...###..#....#.##.#...#.#......#",
            ".........##..##.##.........#.....",
        };
        long long ExpectedValue = 8676;

        test(idTest, N, S, ExpectedValue);
    }

    cout << "Test Case Summary:\n";
    cout << GREEN << "Accepted: " << amount_passed    << RESET << "\n";
    cout << RED   << "Failed: "   << amount_no_passed << RESET << "\n\n";

    if(amount_passed == 14) {
        cout << "All tests passed :D!";
    }
}

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    ExecuteTestSuite();

    return 0;
}