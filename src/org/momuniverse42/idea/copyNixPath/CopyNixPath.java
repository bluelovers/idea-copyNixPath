package org.momuniverse42.idea.copyNixPath;

import org.jetbrains.annotations.NotNull;

/**
 * Copy the full path implementor.
 * @author mubergens Michael Bergens
 */
public class CopyNixPath extends CopyNixAction {

    /**
     * Pass-through, no changes made.
     */
    @Override @NotNull public String adjust(final @NotNull String path) {
        return path;
    }
}
