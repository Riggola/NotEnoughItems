package codechicken.nei.filter;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import codechicken.nei.api.ItemFilter;

/** Matches the complete visible item name in recipe searches, ignoring case and formatting. */
public final class ExactRecipeNameFilter implements ItemFilter {

    private final String name;

    public ExactRecipeNameFilter(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(ItemStack stack) {
        if (stack == null) return false;
        String displayName = EnumChatFormatting.getTextWithoutFormattingCodes(stack.getDisplayName());
        return displayName != null && displayName.equalsIgnoreCase(name);
    }
}
