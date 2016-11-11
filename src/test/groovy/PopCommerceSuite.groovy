/*
 * This software is in the public domain under CC0 1.0 Universal plus a 
 * Grant of Patent License.
 * 
 * To the extent possible under law, the author(s) have dedicated all
 * copyright and related and neighboring rights to this software to the
 * public domain worldwide. This software is distributed without any
 * warranty.
 * 
 * You should have received a copy of the CC0 Public Domain Dedication
 * along with this software (see the LICENSE.md file). If not, see
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */


import org.junit.AfterClass
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.moqui.Moqui

@RunWith(Suite.class)
@Suite.SuiteClasses([ PopcAdminScreenTests.class, PopCommerceScreenTests.class ])
class PopCommerceSuite {
    @AfterClass
    public static void destroyMoqui() {
        Moqui.destroyActiveExecutionContextFactory();
    }
}
