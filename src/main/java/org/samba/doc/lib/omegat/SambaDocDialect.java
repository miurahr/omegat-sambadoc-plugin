/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2007 Didier Briel
               2008 Fabian Mandelbaum, Didier Briel
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

package org.samba.doc.lib.omegat;

import java.util.regex.Pattern;

import org.omegat.filters3.xml.DefaultXMLDialect;

/**
 * This class specifies Smaba-DocBook XML Dialect.
 * 
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author Fabian Mandelbaum
 * @author Hiroshi Miura
 */
public class SambaDocDialect extends DefaultXMLDialect {
    public static final Pattern SAMBADOC_PUBLIC_DTD = Pattern.compile("-//Samba-Team//DTD DocBook.*");
    public static final Pattern SAMBADOC_XMLNS = Pattern
            .compile("xmlns(:\\w+)?=\"http://www.samba.org/samba/DTD/samba-doc\"");

    public SambaDocDialect() {
        defineConstraint(CONSTRAINT_PUBLIC_DOCTYPE, SAMBADOC_PUBLIC_DTD);

        defineParagraphTags(new String[] { "book", "bookinfo", "title", "subtitle", "authorgroup", "author",
                "firstname", "surname", "affiliation", "orgname", "address", "email", "edition", "pubdate",
                "copyright", "year", "holder", "isbn", "keywordset", "keyword", "preface", "title", "para",
                "chapter", "table", "tgroup", "thead", "tbody", "row", "entry", "revhistory", "revision",
                "revnumber", "date", "authorinitials", "revremark", "itemizedlist", "listitem", "member", 
                "releaseinfo"});

        defineOutOfTurnTags(new String[] { "indexterm", });

        definePreformatTags(new String[] { "screen", "programlisting", });

        defineTranslatableAttributes(new String[] { "url", "lang", "xml:lang" });

    }
}
