package org.mahjong4j.yaku.normals;


import org.mahjong4j.hands.MahjongHands;
import org.mahjong4j.tile.MahjongTile;

/**
 * @author yu1ro
 *         発判定クラス
 */
public class HatsuResolver implements NormalYakuResolver {
    private final int HAN = MahjongYakuEnum.HATSU.getHan();

    public HatsuResolver(MahjongHands hands) {

    }

    public int getHan() {
        return HAN;
    }

    public boolean isMatch(MahjongHands hands) {
        return false;
    }

    public boolean isHatsu(MahjongTile[] kotsu) {
        for (int i = 0; i < kotsu.length && kotsu[i] != null; i++) {
            if (kotsu[i] == MahjongTile.HAT) {
                return true;
            }

        }
        return false;
    }
}
