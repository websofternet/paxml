/**
 * This file is part of PaxmlCore.
 *
 * PaxmlCore is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PaxmlCore is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with PaxmlCore.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.paxml.log4j;

public class PatternParser extends org.apache.log4j.helpers.PatternParser {

    public PatternParser(String pattern) {
        super(pattern);
    }

    @Override
    protected void finalizeConverter(char c) {
        switch (c) {
        case 'P':
            addConverter(new ProcessInfoConverter());
            break;
        case 'E':
            addConverter(new EntityInfoConverter(false));
            break;
        case 'e':
            addConverter(new EntityInfoConverter(true));
            break;
        default:
            super.finalizeConverter(c);
        }

    }

}