<#import "../parts/template.ftlh" as c>

<@c.page>
    <h1>Photos</h1>
    <a href="/photos/create">Add photo</a>
    <form method="post">
        <div>
            <label>
                ID:
                <input type="number" name="id" placeholder="ID:">
            </label>
        </div>
        <button>Delete</button>
    </form>
    <ul>
        <#list photos as photo>
            <li>${photo.getId()}. <img src="${photo.getPath()}"></li>
        </#list>
    </ul>
</@c.page>