/*
 * Copyright (c) 2020.  Diego Pennino, Maurizio Pizzonia, Alessio Papi
 *
 *     The dbtree library is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     The dbtree library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with dbtree.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.uniroma3.dbtree.spi.impl.functions

import it.uniroma3.dbtree.spi.Function

class MaxInt: Function<Int, Int, Int> {

    override fun identity(): Int? = Int.MIN_VALUE

    override fun parseA(s: String): Int = s.toInt()

    override fun parseV(s: String): Int =s.toInt()

    override fun h(a: Int?) = a!!
    override fun f(aggList: List<Int?>): Int? = aggList.maxBy { it!! }

    override fun g(v: Int?): Int? = v
}