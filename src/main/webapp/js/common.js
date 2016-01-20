/**
 * Created by OnlyAnywhere on 16/1/19.
 */

function addTab(url, title){

    if ($("#centerArea").tabs('exists', title)) {
        //$("#centerArea").tabs('getTab', title).panel('options').href=url;
        $("#centerArea").tabs('select', title);
    } else {
        $("#centerArea").tabs("add", {
            title : title,
            href : url,
            closable : true,
            cache : false
        });
    }
}
