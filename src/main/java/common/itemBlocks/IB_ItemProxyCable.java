package common.itemBlocks;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class IB_ItemProxyCable extends ItemBlock {

    public IB_ItemProxyCable(Block block) {
        super(block);
    }

    @SuppressWarnings({"unchecked"})
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) {
        lines.add(StatCollector.translateToLocal("tile.kekztech_itemproxycable_block.0.desc"));
    }
}
