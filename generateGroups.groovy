/**
 * Created by kevan on 03/12/14.
 */
import org.jahia.api.Constants
import org.jahia.services.content.JCRSessionFactory
import org.jahia.services.usermanager.JahiaGroupManagerService

def groupSufix = "test group "
def groupService = JahiaGroupManagerService.getInstance()

def createGroup = { name ->
    def session = JCRSessionFactory.instance.getCurrentSystemSession(Constants.EDIT_WORKSPACE, Locale.ENGLISH, Locale.ENGLISH)
    groupService.createGroup(null, name, null, false, session)
}

for ( i in 0..150 ) {
    createGroup(groupSufix + "${i}")
}