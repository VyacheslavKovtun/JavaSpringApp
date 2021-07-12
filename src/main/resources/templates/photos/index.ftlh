<#import "../parts/template.ftlh" as c>

<@c.page>
    <h1>Photos</h1>
    <a href="/photos/create">Add photo</a>
    <ul>
        <#list photos as photo>
            <li><img src="${photo.getPath()}"></li>
        </#list>
    </ul>
</@c.page>