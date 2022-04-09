$(function () {
    $(window).on('load', function () {
        $('#dishesList').hide();
    });
    $(".btn-categ").click(function() {
        let id = $(this).data('id');
        var link = $(this).attr('href');
        getContent();
        $('#dishesList').show();
        $(".btn-categ").change(getContent).next().slideDown(400,function() {
            document.location.href = link;
        })
        function getContent() {
            var url = '/categ?id=' + id;
            $('#dishesList').load(url);
        }
    })
})
