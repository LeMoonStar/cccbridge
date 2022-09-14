package cc.tweaked_programs.cccbridge.blockEntity;

import cc.tweaked_programs.cccbridge.BlockRegister;
import cc.tweaked_programs.cccbridge.peripherals.SourceBlockPeripheral;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SourceBlockEntity extends BlockEntity {
    private SourceBlockPeripheral peripheral;

    public SourceBlockEntity(BlockPos pos, BlockState state) {
        super(BlockRegister.getBlockEntityType("source_block"), pos, state);
    }

    @Nullable
    public List<String> getContent() {
        if (peripheral == null)
            return null;
        return peripheral.getContent();
    }

    public void setSize(int width, int height) {
        if (peripheral != null)
            peripheral.setSize(width, height);
    }
}
