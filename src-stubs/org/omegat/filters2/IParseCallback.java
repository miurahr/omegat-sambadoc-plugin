/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2008 Alex Buloichik
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 **************************************************************************/

package org.omegat.filters2;

import java.util.List;

import org.omegat.core.data.ProtectedPart;

/**
 * Callback for parse files.
 * 
 * @author Alex Buloichik <alex73mail@gmail.com>
 */
public interface IParseCallback {
	
    /**
     * Read entry from source file
     * 
     * @param id
     *            ID in source file, or null if ID not suported by format
     * @param source
     *            source entry text
     * @param translation
     *            exist translation text
     * @param isFuzzy
     *            true if translation is fuzzy
     * @param comment
     *            comment for entry, if format supports it
     * @param path
     *            path of segment
     * @param filter
     *            filter which produces entry
     * @param protectedParts
     *            protected parts
     */
	void addEntry(String id, String source, String translation, boolean isFuzzy, String comment, String path,
        IFilter filter, List<ProtectedPart> protectedParts);
	
    /**
     * Old call without path, for compatibility 
     */
    void addEntry(String id, String source, String translation, boolean isFuzzy, String comment, 
            IFilter filter);

    /**
     * This method can be called from any filter on the end of file processing. It links prev/next segments
     * for multiple translations.
     */
    void linkPrevNextSegments();
}
