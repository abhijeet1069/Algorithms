#include "item.h"

typedef struct list
{
    item_type item;
    struct list *next;
} list;