<#import "../parts/template.ftlh" as c>

<@c.page>
    <form method="post">
        <div>
            <label>
                Path to the photo:
                <input type="text" name="path" placeholder="Path:">
            </label>
        </div>
        <button>Create</button>
    </form>
</@c.page>