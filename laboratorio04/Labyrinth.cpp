#include <bits/stdc++.h>
using namespace std;

#include "Labyrinth.h"

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int N; cin >> N;
    vector<string> S(N);

    for(auto& x: S) cin >> x;

    long long answer = calculateVisibleWallpaperArea(N, S);
    cout << answer << "\n";
}
