/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.filters3;


/**
 * This class is a stub to allow compilation.
 * It is based on the original OmagT class.
 * It is not distributed.
 */
public interface Element {
    /**
     * Returns shortcut string representation of the element. E.g. for
     * &lt;strong&gt; tag should return &lt;s3&gt;.
     */
    String toShortcut();

    /**
     * Returns shorcuts like '\b_i0_\b' for statistics calculation
     */
    String toSafeCalcShortcut();

    /**
     * Returns long XML-encoded representation of the element for storing in
     * TMX. E.g. for &lt;strong&gt; tag should return &lt;bpt
     * i="3"&gt;&amp;lt;strong&amp;gt;&lt;/bpt&gt;.
     */
    String toTMX();

    /**
     * Returns the element in its original form as it was in original document.
     * E.g. for &lt;strong&gt; tag should return &lt;bpt
     * i="3"&gt;&amp;lt;strong&amp;gt;&lt;/bpt&gt;.
     */
    String toOriginal();
}
