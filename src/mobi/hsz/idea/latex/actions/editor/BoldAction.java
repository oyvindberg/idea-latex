/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.latex.actions.editor;

import mobi.hsz.idea.latex.LatexBundle;
import mobi.hsz.idea.latex.util.LatexIcons;
import org.jetbrains.annotations.NotNull;

/**
 * Editor action - bold text.
 *
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.2
 */
public class BoldAction extends EditorAction {

    /** Builds a new instance of {@link BoldAction}. */
    public BoldAction() {
        super(Type.BOLD, LatexBundle.message("editor.bold"), LatexIcons.Editor.BOLD);
    }


    /**
     * Bolds currently selected text or places bold instruction in cursor's position.
     *
     * @param selection selected text
     * @return selected text with bold instruction
     */
    @NotNull
    @Override
    public String replaceAction(@NotNull String selection) {
        return "\\textbf{" + selection + "}";
    }
}
