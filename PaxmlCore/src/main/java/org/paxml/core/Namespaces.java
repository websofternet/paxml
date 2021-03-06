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
package org.paxml.core;

/**
 * paxml namespace contants.
 * 
 * @author Xuetao Niu
 * 
 */
public final class Namespaces {
    /**
     * The root namespace of paxml.
     */
    public static final String ROOT = "http://paxml.org";
    /**
     * The name space of data tag definition.
     */
    public static final String DATA = ROOT + "/data";
    /**
     * The namespace of file invoker tag definition.
     */
    public static final String FILE = ROOT + "/file";
    /**
     * The namespace of command invoker tag definition.
     */
    public static final String COMMAND = ROOT + "/command";
    
    private Namespaces() {
        
    }
}

