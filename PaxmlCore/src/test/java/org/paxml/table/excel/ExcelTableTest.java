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
package org.paxml.table.excel;

import java.io.File;

import org.junit.Test;
import org.paxml.table.IRow;
import org.paxml.table.excel.ExcelTable;

public class ExcelTableTest {
	@Test
	public void testRange() {
		ExcelTable table = new ExcelTable(new File("excel.xls"), null, "A1:B999", true, false);
		for(IRow row:table){
			
		}
		
	}
}
