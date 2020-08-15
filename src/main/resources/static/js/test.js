$("#button1").click(function () {
    var form = $(this).closest('form');
    $.post('/admin/anno', form.serialize(), function (res) {
        if (res.success === true) {
            $(".currencyExchange-page .exchange-amount").val(res.value);
        }
    })
})

